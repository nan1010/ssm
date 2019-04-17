package testText;

import org.junit.Test;
import com.home.domain.NewItemWithBLOBs;
import com.home.service.impl.NewItemServiceImpl;

public class Texttest {
	
	@Test
	public void textTest() {
		NewItemServiceImpl newItemServiceImpl = new NewItemServiceImpl();
		NewItemWithBLOBs newItemWithBLOBs = newItemServiceImpl.findNewItemByName("QT1140");
		String text = newItemWithBLOBs.getYingyonglingyu();
		System.out.println(text);
	}
}
