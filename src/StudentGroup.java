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
		try{
		if(students==null)
			throw new IllegalArgumentException();
		 
			
		}catch(IllegalArgumentException e){
			
		}
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		
			if(students==null)
				throw new IllegalArgumentException();
			count=0;
				for(Student s:students){
					students[count++]=s;
				}
			
		
		
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
		try{
			if(index<0||index>=len)
				throw new IllegalArgumentException();
			if(students[index]==null)
				(this.count)++;
			students[index]=student;
			
			}catch(IllegalArgumentException e){
				
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
					 }
					 s=students[i];
					 students[i]=student;
					 student=s;
					 
				}
			}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		try{
			if(student==null||index<0||index>len-1)
				throw new IllegalArgumentException("illegal");
			if(index>=count)
			 count++;
			for(int i=count-1;i>index;i--)
				 students[i]=students[i-1];
			
			 students[index]=student;
				
			}catch(IllegalArgumentException e){
				
			}
			
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		try{
			if(index<0||index>len-1)
				throw new IllegalArgumentException();
			for(int i=index;i<count-1;i++){
				students[i]=students[i+1];
			}
			count--;
			}catch(IllegalArgumentException e){
				
			}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		try{
			if(student==null)
				throw new IllegalArgumentException();
			for(int i=0;i<count-1;i++){
				if(students[i].equals(student)){
					for(int j=i;j<count-1;j++){
						students[j]=students[j+1];
					}
					}
				}
			
			count--;
			}catch(IllegalArgumentException e){
				
			}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		try{
			if(index<0||index>len-1)
				throw new IllegalArgumentException();
			count=index+1;
			}catch(IllegalArgumentException e){
				
			}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		try{
			if(student==null)
				throw new IllegalArgumentException();
			for(int i=0;i<count-1;i++){
				if(students[i].equals(student)){
					count=i+1;
					}
				}
			
			
			}catch(IllegalArgumentException e){
				
			}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		try{
			if(index<0||index>len-1)
				throw new IllegalArgumentException();
			int j=index;
			for(int i=0;i<len-1-index;i++){
				students[i++]=students[j++];
			}
			count-=index;
			}catch(IllegalArgumentException e){
				
			}
		
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
