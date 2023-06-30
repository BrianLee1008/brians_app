package com.example.shared_ui.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.stopScroll
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

@Composable
fun SharedLazyColumn(
    listState: LazyListState = rememberLazyListState(),
    onBottomReached: () -> Unit = {},
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
    feeds: @Composable (modifier: Modifier) -> Unit
) {
    feeds(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 8.dp)
            .background(MaterialTheme.colors.surface1)
    )
    listState.BottomReached {
        onBottomReached()
        coroutineScope.launch {
            listState.stopScroll()
        }
    }
}

@Composable
fun LazyListState.BottomReached(
    loadMore: () -> Unit
) {
    val bufferSize = 0
    val rememberLoadMore by remember {
        derivedStateOf {
            val lastVisibleItem =
                layoutInfo.visibleItemsInfo.lastOrNull() ?: return@derivedStateOf false
            lastVisibleItem.index != 0 && lastVisibleItem.index >= layoutInfo.totalItemsCount - 1 - bufferSize
        }
    }

    LaunchedEffect(rememberLoadMore) {
        snapshotFlow {
            rememberLoadMore
        }.onEach {
            if (it) loadMore()
        }.collect()
    }
}

