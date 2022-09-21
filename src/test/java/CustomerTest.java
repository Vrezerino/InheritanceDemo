import org.junit.*;
import static org.junit.Assert.*;

import com.vres.*;
import com.vres.Abstract.Customer;

public class CustomerTest {

	@Test
	public void friendCanTalk() {
		VIPCustomer mikael = new VIPCustomer("Mikael", 100000, 60);
		RegularCustomer laura = new RegularCustomer("Laura", 500, 55, mikael);

		assertTrue(((Customer) laura.getFriend()).sound().equals("Hi, I'm a new VIP"));
	}

	@Test
	public void balanceCanBeAltered() {
		RegularCustomer johan = new RegularCustomer("Johan", 45, 55);
		johan.setBalance(johan.getBalance() + 45);

		assertEquals(90, johan.getBalance());
	}
}
