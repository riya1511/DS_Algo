package linkedLists;

class Nodee{
	Nodee next;
	Nodee prev;
	int value;
	Nodee(int value){
		this.value = value;
	}
}

public class BiotonicDLL {

	public static void main(String[] args) {
		Nodee head = new Nodee(20);
		head.next= new Nodee(17);
		head.next.prev = head;
		head.next.next = new Nodee(14);
		head.next.next.prev = head.next;
		head.next.next.next = new Nodee(8);
		head.next.next.next.prev = head.next.next;
		head.next.next.next.next = new Nodee(3);
		head.next.next.next.next.prev = head.next.next.next;
		Nodee res = sort(head);
		while(res != null) {
			System.out.println(res.value);
			res = res.next;
		}
	}
	
	public static Nodee sort(Nodee head) {
		Nodee pivot = head.next;
		Nodee curr = head;
		
		while(pivot != null) {
			if(pivot.value < pivot.prev.value) break;
			
			pivot = pivot.next;
		}
		
		Nodee end1 = pivot.prev;
		Nodee first = curr;
		Nodee second = pivot;
		end1.next = null;
		pivot.prev = null;
		
		second = reverse(second);
		
		Nodee result = merge(first, second);
		
		return result;
	}
	
	public static Nodee reverse(Nodee head) {
		Nodee curr = head;
		
		while(curr.next != null) curr = curr.next;
		head = curr;
		curr.next = curr.prev;
		curr.prev = null;
		curr = curr.next;
		
		while(curr.prev != null) {
			Nodee temp = curr.next;
			curr.next = curr.prev;
			curr.prev = temp;
			curr = curr.next;
		}
		
		curr.prev = curr.next;
		curr.next = null;
		
		return head;
	}
	
	public static Nodee merge(Nodee head1, Nodee head2) {
		if(head1 == null) return head2;
		if(head2 == null) return head1;
		
		if(head1.value <= head2.value) {
			head1.next = merge(head1.next, head2);
			return head1;
		}else {
			head2.next = merge(head1, head2.next);
			return head2;
		}
	}

}
