import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import static Common.Constants.MONEY_TO_PAY;

public class AmountOfMoneyTest extends MainTest {

    @Test(priority = 1)
    @Severity(SeverityLevel.MINOR)
    @Story("Choosing amount of money to pay and then check the actual amount displayed")
    public void registerAUser() {
        mainPage.openAWebsite("https://www.mts.by/").maximizeTheWindow();
        homePage.fillInAmountOfMoney(MONEY_TO_PAY)
                .fillInEmail("buguraev94@gmail.com")
                .fillInNumber("297777777")
                .clckContinueToPaymentPage()
                .checkTheText(MONEY_TO_PAY + " BYN");
    }

}
