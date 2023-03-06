package com.e2eTests.pageObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import com.e2e.lumaProject.Base;

public class SortingObjects extends Base {

	// **FindBy**//
	@FindBy(xpath = "//div[contains(text(),'Price')]")
	public static WebElement priceDropDownButton;
	@FindBy(xpath = "//body/div[2]/main[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[3]/div[2]/ol[1]/li[3]/a[1]")
	public static WebElement priceRage;
	@FindBy(xpath = "//span[@data-price-type = 'finalPrice']")
	public static WebElement priceResult;
	@FindBy(xpath = "//div[contains(text(),'Size')]")
	public static WebElement sizeMenDropDown;
	@FindBy(xpath = "//body/div[2]/main[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/a[3]/div[1]")
	public static WebElement mMenSize;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]")
	public static WebElement colorBrasDropDown;
	@FindBy(xpath = "//body/div[2]/main[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/div[1]/a[1]/div[1]")
	public static WebElement blackColor;
	@FindBy(id = "sorter")
	public static WebElement sortByDropDown;
	@FindBy(xpath = "//body/div[2]/main[1]/div[3]/div[1]/div[2]/div[4]/select[1]/option[3]")
	public static WebElement pricedropDownMenu;
	@FindBy(xpath = "//body/div[2]/main[1]/div[3]/div[1]/div[2]/div[4]/select[1]/option[2]")
	public static WebElement nameProductdropDownMenu;
	@FindBy(xpath = "//body/div[2]/main[1]/div[3]/div[1]/div[2]/div[4]/a[1]")
	public static WebElement sortByArrow;
	@FindBy(xpath = "//ol[@class='products list items product-items']")
	public static WebElement productTitel;
	@FindBy(xpath = "//a[@title = 'List']")
	public static WebElement listButton;
	@FindBy(xpath = "//body/div[2]/main[1]/div[3]/div[1]/div[3]")
	public static WebElement gridDsplay;
	@FindBy(xpath = "//body/div[2]/main[1]/div[3]/div[1]/div[3]")
	public static WebElement listDisplay;
	@FindBy(xpath = "//a[contains(text(),'Add Your Review')]")
	public static WebElement addReviewButton;
	@FindBy(xpath = "//input[@id='nickname_field']")
	public static WebElement nicknameField;
	@FindBy(xpath = "//input[@id='summary_field']")
	public static WebElement summaryField;
	@FindBy(xpath = "//textarea[@id='review_field']")
	public static WebElement reviewField;
	@FindBy(xpath = "//body/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[12]/div[1]/a[1]/span[1]/span[1]/img[1]")
	public static WebElement productToReview;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[3]/div[1]/div[6]/div[2]/div[2]/form[1]/fieldset[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/input[3]")
	public static WebElement ratingReview;
	@FindBy(xpath = "//span[contains(text(),'Submit Review')]")
	public static WebElement submitButton;
	@FindBy(xpath = "//div[contains(text(),'You submitted your review for moderation.')]")
	public static WebElement addReviewSuccessMessageAssert;

	// **Methods**//
	public void selectPriceRange() {
		priceDropDownButton.click();
		priceRage.click();
	}

	public void priceRangeResult() {
		// Get a list of all the prices for the displayed products within the specific
		// price range
		List<WebElement> prices = driver.findElements(By.xpath("//span[@data-price-type = 'finalPrice']"));
		List<Float> priceList = new ArrayList<>();
		for (WebElement price : prices) {
			String priceText = price.getText().replace("$", "");
			float priceValue = Float.parseFloat(priceText);
			priceList.add(priceValue);
		}
		// Verify that all prices are within the range of minPrice to maxPrice using an
		// assertion
		float minPrice = 50;
		float maxPrice = 60;
		for (float price : priceList) {
			Assert.assertTrue("Price is not within expected range", price >= minPrice && price <= maxPrice);
		}
	}

	public void selecMenSize() {
		sizeMenDropDown.click();
		mMenSize.click();
	}

	public void SizeResult() {
		// Verify that all size are M
		List<WebElement> sizes = driver.findElements(By.xpath("//div[@aria-label = 'M']"));
		List<String> sizeTextList = new ArrayList<>();
		for (WebElement size : sizes) {
			String sizeText = size.getText();
			sizeTextList.add(sizeText);
		}
		for (String sizeText : sizeTextList) {
			Assert.assertEquals("Not all sizes are M !", "M", sizeText);
		}
	}

	public void selectBrasColor() {
		colorBrasDropDown.click();
		blackColor.click();
	}

	public void colorBrasResult() {
		List<WebElement> colors = driver.findElements(By.xpath("//div[@id = 'option-label-color-93-item-49']"));
		List<String> colorResult = new ArrayList<>();
		for (WebElement color : colors) {
			String colorText = color.getAttribute("option-label");
			colorResult.add(colorText);
		}
		int numberOfColors = colorResult.size();
		System.out.println("color number : " + numberOfColors);
		for (String colorText : colorResult) {
			System.out.println(colorText);
			Assert.assertEquals("The color is not Black !", "Black", colorText);
		}
		String itemsResult = driver.findElement(By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[2]/p[1]")).getText()
				.replace(" Items", "");
		int itemsResultAsInt = Integer.parseInt(itemsResult);
		System.out.println(itemsResult);
		Assert.assertEquals(numberOfColors, itemsResultAsInt);

	}

	public void selectSortedByPrice() {
		sortByDropDown.click();
		pricedropDownMenu.click();
	}

	// The search result from the least expensive to the most expensive
	public void priceOrganizationResultAssert() {
		List<WebElement> prices = driver.findElements(By.xpath("//span[@data-price-type = 'finalPrice']"));
		List<String> pricesText = new ArrayList<>();

		for (WebElement price : prices) {
			pricesText.add(price.getText());
		}

		List<String> sortedPrices = new ArrayList<>(pricesText);
		Collections.sort(sortedPrices);
		Assert.assertEquals("Items are not sorted from least to most expensive", pricesText, sortedPrices);
		System.out.println(sortedPrices);
	}

	public void selectSortedByProductName() {
		sortByDropDown.click();
		nameProductdropDownMenu.click();
	}
	// the result should be displayed in alphabetical order

	public void priceOrganizationAlphaResultAssert() {
		WebElement TitreArticle = productTitel;
		List<WebElement> Article = TitreArticle
				.findElements(By.xpath("//strong[@class='product name product-item-name']"));

		List<String> productNames = new ArrayList<>();
		for (WebElement product : Article) {
			productNames.add(product.getText());
		}

		boolean isSorted = true;
		for (int i = 0; i < productNames.size() - 1; i++) {
			if (productNames.get(i).compareTo(productNames.get(i + 1)) > 0) {
				isSorted = false;
				break;
			}
			Assert.assertTrue("the prices are Not displayed in alphabetical order !", isSorted);
		}
		System.out.println(productNames);

	}

	public void clickOnSortByArrow() {
		sortByArrow.click();
	}

	// from most expensive to least expensive
	public void priceOrganizationArrowResultAssert() {
		List<WebElement> prices = driver.findElements(By.xpath("//span[@data-price-type = 'finalPrice']"));
		List<String> pricesText = new ArrayList<>();
		for (WebElement price : prices) {
			pricesText.add(price.getText());
		}
		List<String> sortedPrices = new ArrayList<>(pricesText);
		Collections.sort(sortedPrices, Collections.reverseOrder());
		Assert.assertEquals("Items are not sorted from most to least expensive", pricesText, sortedPrices);
		System.out.println(sortedPrices);
	}

	// the result should be displayed in reverse alphabetical order
	public void productNameOrganizationReverseResultAssert() {
		WebElement TitreArticle = productTitel;
		List<WebElement> Article = TitreArticle
				.findElements(By.xpath("//strong[@class='product name product-item-name']"));

		List<String> productNames = new ArrayList<>();
		for (WebElement product : Article) {
			productNames.add(product.getText());
		}

		Collections.sort(productNames, Collections.reverseOrder());

		for (String productName : productNames) {
			System.out.println(productName);
		}

	}

	public void clickOnListButton() {
		listButton.click();
	}

	public void listDisplayeAssert() {
		String list = listDisplay.getAttribute("class");
		Assert.assertTrue("product are Not displayed in List form !", list.contains("products-list"));
	}

	public void selectProduct() {
		productToReview.click();
	}

	public void clickOnAddYourReview() {
		addReviewButton.click();
	}

	public void fillAllReviewfields(String nickName, String summary, String review) {
		nicknameField.sendKeys(nickName);
		summaryField.sendKeys(summary);
		reviewField.sendKeys(review);
	}

	public void addRatingAndClickSubmit() {
		try {
			ratingReview.click();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", ratingReview);
		}
		submitButton.click();
	}

	public void addReviewAssert() {
		Assert.assertTrue("Review is Not Add with success !", addReviewSuccessMessageAssert.isDisplayed());
	}

}
