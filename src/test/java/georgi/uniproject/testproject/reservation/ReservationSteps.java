package georgi.uniproject.testproject.reservation;

import static org.junit.Assert.assertEquals;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import georgi.uniproject.testproject.models.ReservationScreenModel;

public class ReservationSteps {
	
	private ReservationScreenModel reservationScreen;
	
	@Given("^Потребителя отваря екрана за резервация$")
	public void openReservationScreen() throws Throwable {
		reservationScreen=new ReservationScreenModel();
	}

	@When("^Потребителят избере прожекция: (\\d+)$")
	public void chooseProjection(final int projection) throws Throwable {
		reservationScreen.setProjectionID(projection);
	}

	@When("^Избере (\\d+) билета \"([^\"]*)\"$")
	public void chooseTickets(final int ticketCount,final String ticketType) throws Throwable {
		reservationScreen.setTicketCount(ticketCount);
		reservationScreen.setTicketType(ticketType);
	}

	@When("^Избере места:$")
	public void chooseSeats(final List<Integer> seats) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		reservationScreen.setSeats(seats);
	}

	@When("^Въведе имейл: \"([^\"]*)\"$")
	public void inputEmail(final String email) throws Throwable {
		reservationScreen.setEmail(email);
	}

	@When("^Натисне бутона за резервиране на билет$")
	public void clickReservationButton() throws Throwable {
		reservationScreen.clickReservationButton();
	}

	@Then("^Вижда съобщение: \"([^\"]*)\"\\.$")
	public void checkMessage(final String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, reservationScreen.getMessage());
	}
}
