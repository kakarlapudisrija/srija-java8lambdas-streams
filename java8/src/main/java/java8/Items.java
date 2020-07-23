package java8;
import java.util.*;
import java.util.stream.Collectors;
public class Items {
	public static List<String> match(List<String> list)
	{
		return list.stream().filter(string->(string.charAt(0)=='a' && string.length()==3)).collect(Collectors.toList());
	}
}
