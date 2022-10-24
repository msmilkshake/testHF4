import java.util.*;

public class LinkedListPro {
	
	// Método main de teste
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedListPro llp = new LinkedListPro();
		int en = sc.nextInt(); // número de elementos a inserir na Linked-List
		for (int i = 0; i < en; i++)
			llp.enqueue(sc.next()); // insere palavras na Linked-List
		int deq = sc.nextInt(); // número de elementos a retirar
		for (int i = 0; i < deq; i++)
			llp.dequeue();
		en = sc.nextInt(); // número de elementos a inserir
		for (int i = 0; i < en; i++)
			llp.enqueue(sc.next());
		System.out.println(llp.size() + " " + llp.find(sc.next()));
		sc.close();
	}
	
	// Verifica se a fila está vazia
	public boolean isEmpty() {}

	// Devolve o número de itens contidos na fila
	public int size() {}

	// Insere um novo item na fila
	public void enqueue(String item) {}

	// Retira um item da fila
	public String dequeue() {}

	// Verifica se um item se encontra na fila
	public boolean find(String key) {}
}
