import java.util.Arrays;
import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	private int count;
	public int len;
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
		this.count=0;
		len=length;
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
	
		if(students==null)
			throw new IllegalArgumentException();
		 
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		
			if(students==null)
				throw new IllegalArgumentException();
			count=students.length;
				this.students=Arrays.copyOf(students, count);
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		
			if(index<0||index>=len)
				throw new IllegalArgumentException();
			 
				
			return students[index];
	
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		
			if(index<0||index>=len)
				throw new IllegalArgumentException();
			if(students[index]==null){
				(this.count)++;
			students[index]=student;
			}else{
				Student s[]=Arrays.copyOfRange(students, index, len-1);
				s[index]=student;
				int j=0;
				for(int i=index+1;i<len;i++)
					s[i]=s[j++];
			}
		
	}		

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		
			if(student==null)
				throw new IllegalArgumentException();
			 count++;
			 Student s;
			 for(int i=0;i<len;i++){
				 if(students[i]==null){
					 students[i]=student;
					 break;
				 }
				 s=students[i];
				 students[i]=student;
				 student=s;
				 
			 }
				 
			
		
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		
			if(student==null)
				throw new IllegalArgumentException();
			if(count==len)
				throw new IllegalArgumentException();
			else{
				 Student s;
				for(int i=len-1;i>=0;i--){
					 if(students[i]==null){
						 continue;
					 }else{
					
					 students[i+1]=student;
					break;
					
					 }
					 
				}
				count++;
			}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		
			if(student==null||index<0||index>len-1)
				throw new IllegalArgumentException();
			 count++;
			int i;
			for(i=index;i<len;i++){
				if(students[i]==null)
					break;
				Student s=students[i];
				students[i]=student;
				student=s;
			}
				 students[i]=student;
	
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		
			if(index<0||index>len-1)
				throw new IllegalArgumentException();
			students[index]=null;
			count--;
			
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		
			if(student==null)
				throw new IllegalArgumentException();
			for(int i=0;i<count-1;i++){
				if(students[i].equals(student)){
					
					for(int k=i;k<len-1&&students[k]!=null;k++){
						students[k]=students[k+1];
					}
					count--;
					}
				}
			
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		
			if(index<0||index>len-1)
				throw new IllegalArgumentException();
			for(int i=index;i<len;i++){
				if(students[i]!=null){
					students[i]=null;
					count--;
				}
			}
			
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		
			if(student==null)
				throw new IllegalArgumentException();
			for(int i=0;i<len;i++){
				if(students[i].equals(student)){
					for(int k=i;k<len;k++){
						if(students[k]!=null){
						students[k]=null;
						count--;
						}
					}
					break;
					}
				}
			
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		
			if(index<0||index>len-1)
				throw new IllegalArgumentException();
			int j=index;
			for(int i=0;i<index;i++){
				students[i++]=students[j++];
			}
			count-=index;
			
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		try{
			if(students==null)
				throw new IllegalArgumentException();
			int index=0;
			for(int i=0;i<len-1;i++){
				if(students[i].equals(student)){
					removeToIndex(i);
					index=i;
					break;
				}
			}
			count-=index;
			}catch(IllegalArgumentException e){
				
			}
		
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		int i,j;
		
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
