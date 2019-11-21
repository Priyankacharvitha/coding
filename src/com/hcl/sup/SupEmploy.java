package com.hcl.sup;

class HclEmploy {
	String sapID;
	String name;
	String gender;
	String designation;
	public HclEmploy(String sapID, String name, String gender,
			String designation) {
		super();
		this.sapID = sapID;
		this.name = name;
		this.gender = gender;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "HclEmploy [sapID=" + sapID + ", name=" + name + ", gender="
				+ gender + ", designation=" + designation + "]";
	}
	
}
class Vidya extends HclEmploy {
public Vidya(String sapID, String name, String gender, String designation) {
		super(sapID, name, gender, designation);
		// TODO Auto-generated constructor stub
	}
}
class Haritha extends HclEmploy {
public Haritha(String sapID, String name, String gender, String designation) {
		super(sapID, name, gender, designation);
		// TODO Auto-generated constructor stub
	}
}
class Mounika extends HclEmploy {
public Mounika(String sapID, String name, String gender, String designation) {
		super(sapID, name, gender, designation);
		// TODO Auto-generated constructor stub
	}
}

public class SupEmploy {
	public static void main(String[] args) {
		HclEmploy employVidya=new Vidya("463", "Vidya", "female", "softwareengineer");
		HclEmploy employHarita=new Haritha("465", "Haritha", "female", "softwareengineer");
		HclEmploy employMounika=new Mounika("466", "Mounika", "female", "softwareengineer");
		HclEmploy[] aarrHcl={employVidya,employHarita,employMounika};
		for (HclEmploy hclEmploy :aarrHcl) {
			System.out.println(hclEmploy);
		}
				
			
		}
		
	}


