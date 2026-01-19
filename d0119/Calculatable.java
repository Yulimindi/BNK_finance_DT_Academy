package d0119;

public interface Calculatable<T> {
	// 2개의 제네릭 매개변수가 있음, 반환 타입도 제네릭으로 표현
	T Calc(T a, T b);
}
