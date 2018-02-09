public class ComparableCircle extends Circle 
	implements Comparable<ComparableCircle> {
		
/** Construct a ComparableCircle with specified properties */
public ComparableCircle(double radius) {
	super(radius);
}

@Override // Implement the compareTo method defined in Comparable
public int compareTo(ComparableCircle o) {
	if (getArea() > o.getArea())
		return 1;
	else if (getArea() < o.getArea())
		return -1;
	else
		return 0;
}

}
