package Test;

import Data.DataHelper;
import Pages.CardTopUpPage;
import Pages.DashboardPage;
import Pages.LoginPage;
import org.junit.jupiter.api.Test;

import static Data.DataHelper.getCardNumber1;
import static Data.DataHelper.getCardNumber2;
import static com.codeborne.selenide.Selenide.open;

public class MoneyTransferTest {
    @Test
    void shouldTransferMoneyBetweenOwnCards() {
        open("http://localhost:9999");
        var loginPage = new LoginPage();
        var authInfo = DataHelper.getAuthInfo();
        var verificationPage = loginPage.validLogin(authInfo);
        var verificationCode = DataHelper.getVerificationCodeFor(authInfo);
        verificationPage.validVerify(verificationCode);
        var dashboardPage = new DashboardPage();
        var cardNumber = dashboardPage.clicksOnCard();
        var cardTopUpPage = new CardTopUpPage();
        cardTopUpPage.shouldTransferMoney(getCardNumber2());





    }
}
