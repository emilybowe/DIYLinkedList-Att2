import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

internal class MyListTest {
	@Test
	fun test1() {
		var myList = MyList<String>()
		assertTrue(myList.isEmpty())
	}

	@Test
	fun test2() {
		var myList = MyList<String>()
		myList.addHead("10")
		myList.print()
	}

	@Test
	fun test3() {
		var myList = MyList<String>()
		myList.addHead("10")
		myList.addHead("20")
		myList.print()
	}

	@Test
	fun test4() {
		var myList = MyList<String>()
		myList.addTail("10")
		myList.addTail("20")
		myList.print()
	}

	@Test
	fun test5() {
		var myList = MyList<String>()
		myList.addTail("10")
		myList.addTail("20")
		myList.addTail("30")
		myList.addHead("40")
		myList.print()
		myList.addTail("50")
		myList.print()
	}

	@Test
	fun test6() {
		var myList = MyList<String>()
		myList.addTail("10")
		myList.addTail("20")
		myList.removeHead()
		myList.print()
	}

	@Test
	fun testNew6() {
		var myList = MyList<Int>()
		myList.addTail(10)  //head
		myList.addTail(20) //
		myList.addTail(30) // thing
		println(myList.removeElement(10))
		println(myList.head!!.element)
	}

	@Test
	fun test7() {
		var myList = MyList<Int>()
		myList.addTail(10)  //head
		myList.addTail(20) //
		myList.addTail(30) // thing
		println(myList.removeElement(20))
	}

	@Test
	fun test8() {
		var myList = MyList<Int>()
		myList.addTail(10)  //head
		myList.addTail(20) // thing
		myList.addTail(30) // null
		println(myList.removeElement(30))
	}
}


