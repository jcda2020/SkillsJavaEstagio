package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SegundoTesteStreams {

	
	public static void main(String[] args) {
		
		List<String> nomes = Arrays.asList("Jo�o", "Maria", "Jos�");
		
		Stream<String> st = nomes.stream();
		st.forEach(System.out::println);
		
	}
}
