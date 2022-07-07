package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SegundoTesteStreams {

	
	public static void main(String[] args) {
		
		List<String> nomes = Arrays.asList("João", "Maria", "José");
		
		Stream<String> st = nomes.stream();
		st.forEach(System.out::println);
		
	}
}
