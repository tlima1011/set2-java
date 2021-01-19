package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Set<Integer> a = new HashSet<Integer>();
		Set<Integer> b = new HashSet<Integer>();
		Set<Integer> c = new HashSet<Integer>();

		System.out.print("How many students for course A? "); // 3
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			Integer num = sc.nextInt();
			a.add(num);
		}
		System.out.print("How many students for course B? "); // 3
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			Integer num = sc.nextInt();
			b.add(num);
		}
		System.out.print("How many students for course C? "); // 3
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			Integer num = sc.nextInt();
			c.add(num);
		}
		Set<Integer> d = new HashSet<Integer>(a);
		d.addAll(b);
		Set<Integer> e = new HashSet<Integer>(c);
		Set<Integer> f = new HashSet<Integer>(d);
		f.addAll(e);
		System.out.println("Total students: " + f.size());
		sc.close();
	}
}
