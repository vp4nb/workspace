package assignment.afterclass13;

public class Doctor {

	 private int docId;
	  private String name;
	  private String specialization;
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String toString()
	{
		return "doctor id:"+docId+"\ndoctor name:"+name+"\nSpecialoization:"+specialization;
	}
	public int hashCode(){
		return 31*(name.hashCode()*specialization.hashCode());
	}
	public boolean equals(Object doc)
	{
		if(doc==null)
			return false;
		if(doc instanceof Doctor)
		{
			if(docId==((Doctor) doc).getDocId()&&
					name.equals(((Doctor) doc).getName())&&
					specialization.equals(((Doctor) doc).getSpecialization()))
			{
				return true;
			}
		}
		return false;
	}
}
