package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.SearchPage;
import java.util.List;

public class SearchTests extends BaseTest {
    @Test
    public void basicSearchTest() throws InterruptedException {
        String searchTerm = "Selenium";
        Assert.assertTrue(landingPage.isPageLoaded(), "Landing page is not loaded");
        SearchPage searchPage = landingPage.startSearch("Selenium");
        Assert.assertTrue(searchPage.isPageLoaded(), "Search page is not loaded");
        Assert.assertEquals(searchPage.getSearchResulCount(), 9, "Search result count is wrong");
        List<String> SearchResultList = searchPage.getSearchResultLists();
        for (String searchResult : SearchResultList) {
            Assert.assertTrue(searchResult.contains(searchTerm),
                    "Search term :  " + searchTerm + " not found in: \n" + searchResult);
        }
        searchPage.startSearchSecond(searchTerm);
        Assert.assertEquals(searchPage.getSearchResulCount(), 10, "Search result count is wrong");
        List<String> SearchResultListSecond = searchPage.getSearchResultLists();
        for (String searchResult : SearchResultList) {
            Assert.assertTrue(searchResult.contains(searchTerm),
                    "Search term :  " + searchTerm + " not found in: \n" + searchResult);
        }
    }

}



