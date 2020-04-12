import java.util.ArrayList;
import java.util.List;

class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer> labPoints;
	Student(String index,String firstName,String lastName)
	{
		this.index=index;
		this.firstName=firstName;
		this.lastName=lastName;
		labPoints = new ArrayList<Integer>();
	}
	public String getIndex()
	{
		return index;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void printLabPoints()
	{
		for(int i=0;i<labPoints.size();i++)
			System.out.println(labPoints.get(i));
	}
	public void setIndex(String index)
	{
		this.index = index;
	}
	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}
	public void addLabPoints(Integer labPoint)
	{
		labPoints.add(labPoint);
	}

	public double getAverage() {
		double labPointsSum =0;
		for(int i=0;i<labPoints.size();i++)
			labPointsSum+=labPoints.get(i);
		return labPointsSum/labPoints.size();
	}

	public boolean hasSignature() {
		if(labPoints.size()>=8)
			return true;
		else
			return false;
	}
}
