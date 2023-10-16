package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class PaymentPage extends MainPage{

    private final SelenideElement amountOfMoneyToPay = $x("//p[@class='header__payment-amount']");

    @Step("Check whether text contains {textMoney}")
    public PaymentPage checkTheText(String textMoney){
        amountOfMoneyToPay.shouldHave(Condition.text(textMoney), Duration.ofSeconds(10));
        return this;
    }
}
