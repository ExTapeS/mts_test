package Pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.*;

public class HomePage extends MainPage{

    private final SelenideElement phoneNmbrFld = $x("//input[@id='connection-phone']");

    private final SelenideElement amntOfMoneyFld = $x("//input[@id='connection-sum']");

    private final SelenideElement emailFld = $x("//input[@id='connection-email']");

    private final SelenideElement continueBtn = $x("//button[contains(text(),'Продолжить')]");

    private final SelenideElement frame = $x("//iframe[contains(@class, 'bepaid-iframe')]");


    @Step("Clicking continue button and go to payment page")
    public PaymentPage clckContinueToPaymentPage(){
        continueBtn.click();
        switchTo().frame(frame);
        return page(PaymentPage.class);
    }

    @Step("Filling in number with +375{phoneNumber}")
    public HomePage fillInNumber(String phoneNumber){
        phoneNmbrFld.sendKeys(phoneNumber);
        return this;
    }

    @Step("Filling in amount of money with {amountMoney}")
    public HomePage fillInAmountOfMoney(String amountMoney){
        amntOfMoneyFld.sendKeys(amountMoney);
        return this;
    }

    @Step("Filling in email field with {email}")
    public HomePage fillInEmail(String email){
        emailFld.sendKeys(email);
        return this;
    }


}
