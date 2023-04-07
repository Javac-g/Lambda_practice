package AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Test1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Task1Test {

	final private static String MY_UTILS = "AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Task1";

	@DisplayName("Check that Main class is present")
	@Test
	void isTypeClassMain() {
		try {
			assertNotNull(Class.forName(MY_UTILS + ".Main"));
			assertEquals("Main", Class.forName(MY_UTILS + ".Main").getSimpleName());
		} catch (ClassNotFoundException e) {
			fail("There is no class Main");
		}
	}

	@DisplayName("Check that Main class contains 'getCount' method")
	@Test
	void hasGetCountMethod() {
		Method[] methods = null;
		try {
			methods = Class.forName(MY_UTILS + ".Main").getDeclaredMethods();
		} catch (ClassNotFoundException e) {
			fail("There is no class Main");
		}
		boolean isMyUtilMethod = false;
		for (Method method : methods) {
			if (method.getName().equals("getCount")) {
				isMyUtilMethod = true;
				break;
			}
		}
		assertTrue(isMyUtilMethod);
	}

	@DisplayName("Check that 'getCount' method returns int")
	@Test
	void hasMethodReturnType() {
		Method[] methods = null;
		try {
			methods = Class.forName(MY_UTILS+".Main").getDeclaredMethods();
		} catch (ClassNotFoundException e) {
			fail("There is no class Main");
		}
		boolean isMyUtilMethod = false;
		for (Method method : methods) {
			if (method.getName().equals("getCount")) {
				isMyUtilMethod = true;
				assertEquals(method.getReturnType(), int.class);
				break;
			}
		}
		assertTrue(isMyUtilMethod);

	}

	@DisplayName("Check that 'getCount' method returns an appropriate value")
	@ParameterizedTest
	@MethodSource("provideDataForCountMethod")
	void getCountType(int[] arr, Predicate<Integer> condition, int result) {
		Class<?> clazz = null;
		try {
			clazz = Class.forName(MY_UTILS+".Main");
		} catch (ClassNotFoundException e) {
			fail("There is no class Main");
		}
		Method m = null;
		try {
			m = clazz.getDeclaredMethod("getCount", int[].class, Predicate.class);
			assertTrue((int) m.invoke(null, arr, condition) == result);
		} catch (NoSuchMethodException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			fail("There is no method getCount");
		}
	}

	private static Stream<Arguments> provideDataForCountMethod() {
		return Stream.of(Arguments.of(new int[] { 1, 1, 3, -1, -5, 0, 5 }, (Predicate<Integer>) i -> 4 > i & i > 0, 3),
				Arguments.of(new int[] { 1, 2, 3, 4, 0, -1, -2, -3, -4 }, (Predicate<Integer>) i -> i % 2 == 0, 5),
				Arguments.of(new int[] {}, (Predicate<Integer>) i -> false, 0),
				Arguments.of(new int[] { 1, 2, 3, 4, 0, -1, -2, -3, -4 }, (Predicate<Integer>) i -> true, 9),
				Arguments.of(new int[] { 1, 2, 3, 4, 0, -1, -2, -3, -4 }, (Predicate<Integer>) i -> i < 2, 6));
	}
}

