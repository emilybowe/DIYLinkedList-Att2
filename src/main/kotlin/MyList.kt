class MyListElement<T>(val element: T, var next: MyListElement<T>? = null) {
/*	operator fun compareTo(other: MyListElement<T>): Int {
		if(this.element is String? && other.element is String?) {
			return this.element!!.compareTo(other.element!! as String)
		} else {
			if(this.element > other.element) return 1
			//else if(this.element < other.element) return -1
			return 0
		}
	}*/
}


/*
//why is this recursive
private operator fun <T> T.compareTo(element: T): Int {
	if(this > element) return 1
	else if(this < element) return -1
	else return 0
}*/



//#adding to a linkedlist is always O(N) because you have to traverse the list and add to the tail
//element is data we're storing
//mylist is a wrapper around MLE
//gives context to MLE
//if list empty make head new obj
//if not empty, find end and stick it on there
//create the list, head is null, default
//isEmpty infers return type from expression
//fun isEmpty() = //this is the function body
//func head == null
//want to add to the end
//therefore if head != null, find the tail then add

class MyList<T>(var head: MyListElement<T>? = null) {


	fun isEmpty() = head == null

	fun addTail(obj: T) {
		if(head == null) {
			head = MyListElement(obj) //head is on heap
		} else {
			var thing = head //can't move head need to keep ref to top of list - don't manipulate this or you would lose your head
			while(thing!!.next != null) {
				thing = thing.next //thing is a stack variable //.next memory address
			}
			thing.next = MyListElement(obj) //heap variable - lasts longer //next doesn't do anything
		}
	}

	fun addHead(obj: T) {
		if(head == null) {
			head = MyListElement(obj)
		} else {
			val h = MyListElement(obj, head)
			head = h
		}
	}

	fun print() {
		var curr = head
		while (curr != null) {
			println(curr.element)
			curr = curr.next
		}

	}

	fun removeHead(): T? {
		if(head == null) {
			return null
		} else {
			var oldHead = head
			head = head!!.next
			if (oldHead != null) {
				return oldHead.element
			}
		}
	return null
	}

/*	fun addAfter() { //sort list and find right place to insert a number e.g. 50 is after 40 and before 60. print and see result

	}*/

/*	fun sort() { //specific one, assume no duplicates
		if(head == null) {
			println("empty list")
		} else {
			var thing = head
			if (thing != null) {
				if(thing.element is String? && thing.next?.element is String?) {

				} else if(thing.element!! > thing.next?.element!!) {
					println("thing is greater")
					println(thing)
					println(thing.next!!.element)
				}
			}

		}
	}*/

	//find the thing to remove and delete it

	fun removeElement(obj: T) : String {
		var thing = head
		if(head == null) {
			return "Empty List"

		} else if(head != null) {

			if(head!!.element == obj) {

				if(thing!!.next == null) { //head matches, once removed list empty
					head = null
					return "head matches, now list empty"

				} else if (thing!!.next != null) { ////head matches, set new head
					head = thing.next
					return "head removed, new Head set to thing.next: ${head!!.element}"
				}

			} else if(head!!.element != obj) {

				if(thing!!.next == null) { //one item (head) in list, and no match
					return "No matches"

				} else { //search

					while(thing!!.next != null) {
						thing = thing.next
						if(obj == thing!!.element) {
							thing = thing.next
							return "removed $obj - list contains ${head!!.element}, ${thing!!.element}"
						} else {
							var prev = thing
							thing = thing.next
							if(obj == thing!!.element) {
								thing = prev
								thing.next = null
								return "removed $obj - list contains ${head!!.element}, ${thing!!.element}"
							}
						}
					}
				}

			}

		}
		return "No match for $obj in the list"
	}
}





