package lab7OOP;
public class MyPair<T, U> {
	public final T Fst;
	public final U Snd;
	public MyPair(T fst, U snd) {
		this.Fst = fst;
		this.Snd = snd;
		}
	@Override

	public String toString() {
		return "(" + Fst + ", " + Snd + ")";
		}
	
	
	public MyPair Swap() {
		return new MyPair <U,T> (Snd, Fst);
	}

	
}