package com.example.home_ui.ui.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.home_domain.ext.HomeTab
import com.example.shared_ui.main.state.RootState
import com.example.shared_ui.main.ui.surface1
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(modifier: Modifier, rootState: RootState, tabList: List<HomeTab>) {


    val pagerState = rememberPagerState(0)

    Column(modifier = modifier) {
        TabRow(
            modifier = Modifier
                .height(40.dp)
                .padding(8.dp, 0.dp),
            backgroundColor = MaterialTheme.colors.surface1,
            selectedTabIndex = pagerState.currentPage,
            divider = {
                TabRowDefaults.Divider(
                    thickness = 4.dp,
                    color = MaterialTheme.colors.error
                )
            }
        ) {
            HomeTab(
                tabList = tabList,
                selectedTabIndex = pagerState.currentPage,
                onTabSelected = { index, tab ->
                    rootState.coroutineScope.launch {
                        pagerState.animateScrollToPage(index)
                    }
                }
            )
        }
        HorizontalPager(
            modifier = Modifier.fillMaxSize(),
            pageCount = tabList.size,
            state = pagerState
        ) { page ->
            HomeFeed(
                rootState = rootState,
                tabType = tabList[page],
                pagingComplete = page == pagerState.currentPage
            )
        }

    }
}

@Composable
fun HomeTab(
    tabList: List<HomeTab>,
    selectedTabIndex: Int,
    onTabSelected: (index: Int, tabName: String) -> Unit
) {
    tabList.forEachIndexed { index, tab ->

        val isSelected = selectedTabIndex == index

        Tab(
            modifier = Modifier,
            selected = isSelected,
            onClick = {
                onTabSelected.invoke(index, tab.type)
            },
            text = {
                Text(
                    modifier = Modifier.wrapContentSize(),
                    text = tab.type,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1,
                )
            },
            selectedContentColor = MaterialTheme.colors.primary,
            unselectedContentColor = MaterialTheme.colors.surface1
        )
    }
}

@Composable
fun HomeFeed(rootState: RootState, tabType: HomeTab, pagingComplete: Boolean) {
    when (tabType) {
        HomeTab.MAIN -> {
            MainTabRoute(rootState = rootState, pagingComplete = pagingComplete)
        }
        HomeTab.BOOKMARK -> {

        }
    }

}