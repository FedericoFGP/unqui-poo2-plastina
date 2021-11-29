package tp7.Composite.WarcraftTest;
import ar.edu.unq.po2.tp7.Composite.war.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.awt.Point;
class testPoint {

	@Test
	void test() {
		Point a = new Point(0,5);
		Point b = new Point(5,5);
		
		
		while(a != b) {
		//	a = a.distance(b);
		}
		System.out.println(a.distance(b));
		
		assertTrue(true);
	}

}
