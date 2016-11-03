package linkedList;

public class SingleLinkedList <T>  implements List<T>{

	private Node<T> head;

	@Override
	public boolean isEmpty() {

		return (head == null);
	}

	@Override
	public void add(int index, T value) throws ListAccessError {
		if(index == 0 && isEmpty()){
			head = new Node<T> (value);
			return;
		}

		//link the the new value to the last element
		Node<T> temp = head;
		for(int i = 0; i< index -1; i++){
			temp = temp.getNext();
		}
		temp.setNext(new Node<T>(value));
	}

	@Override
	public T remove(int index) throws ListAccessError {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T get(int index) throws ListAccessError {
		Node<T> temp = head;
		for(int i = 0; i< index; i++){
			try {
				temp = temp.getNext();
			} catch(NullPointerException e) {
				throw new ListAccessError("Index " + (i+1) + " does not exist.");
			}
		}
		try {
			return temp.getValue();
		} catch(NullPointerException e) {
			throw new ListAccessError("Index " + index + " does not exist.");
		}
	}

}
