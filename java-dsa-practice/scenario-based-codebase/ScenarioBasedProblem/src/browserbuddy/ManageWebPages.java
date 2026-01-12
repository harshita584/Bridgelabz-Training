package browserbuddy;

import java.util.Stack;

public class ManageWebPages {
	WebPages headPages;
	Stack<WebPages> history = new Stack<>();

	public void addPage(String url) {
		WebPages newWebPages = new WebPages(url);
		if (headPages == null) {
			headPages = newWebPages;
			return;
		}

		WebPages tempPages = headPages;
		while (tempPages.nextPages != null) {
			tempPages = tempPages.nextPages;
		}
		tempPages.nextPages = newWebPages;
		newWebPages.prevPages = tempPages;
	}

	public void removePage(String url) {
		if (headPages == null) {
			System.out.println("There is no page to remove ");
			return;
		}
		WebPages tempPage = headPages;
		while (!tempPage.url.equals(url) && tempPage.nextPages != null) {
			tempPage = tempPage.nextPages;
		}
		if (tempPage.url.equals(url)) {
			if (tempPage.nextPages == null) {
				tempPage.prevPages.nextPages = null;
				return;
			} else {
				tempPage.prevPages.nextPages = tempPage.nextPages;
				tempPage.nextPages.prevPages = tempPage.prevPages;
				return;
			}
		} else {
			System.out.println("There is not page like this in this Tab ");
			return;
		}
	}

	public void removeWindow() {
		history.push(headPages);
		headPages = null;
	}

	public void restoreWindow() {
		if (headPages == null) {
			if (!history.empty()) {
				headPages = history.pop();
			} else {
				System.out.println("There is nothing to restore window ");
			}
		} else {
			WebPages tempPages = headPages;
			if (!history.empty()) {
				headPages = history.pop();
				history.push(tempPages);
			} else {
				System.out.println("There is nothing to restore window ");
			}
		}

	}

	public void displayPages() {
		if (headPages == null) {
			System.out.println("No units present.");
			return;
		}

		WebPages temp = headPages;

		System.out.println("Tab names \n\n");

		do {
			System.out.println("Tab : " + temp.url);
			temp = temp.nextPages;
		} while (temp != null);

		System.out.println("\n");
	}
}
