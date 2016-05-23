package www.imooc.com;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;


/**
 * 创建json数据*/
public class TestJson {

	public static void main(String[] args) {
		Result result = new Result();
		result.setResult(1);
		
		List<Person> persons = new ArrayList<Person>();
		
		//创建Person1的数据
		SchoolInfo schoolInfo1=new SchoolInfo();
		schoolInfo1.setSchoolName("清华");
		SchoolInfo schoolInfo2=new SchoolInfo();
		schoolInfo2.setSchoolName("北大");
		
		List<SchoolInfo> schoolInfos = new ArrayList<SchoolInfo>();
		schoolInfos.add(schoolInfo1);
		schoolInfos.add(schoolInfo2);
		
		Person person1 = new Person();
		person1.setName("张三");
		person1.setAge(12);
		person1.setSchoolInfo(schoolInfos);
		person1.setUrl("http://img0.imgtn.bdimg.com/it/u=1163422214,3068098024&fm=21&gp=0.jpg");
		
		persons.add(person1);
		
		//创建Person2的数据
		SchoolInfo schoolInfo3=new SchoolInfo();
		schoolInfo3.setSchoolName("人大");
		SchoolInfo schoolInfo4=new SchoolInfo();
		schoolInfo4.setSchoolName("厦大");
		
		List<SchoolInfo> schoolInfos1 = new ArrayList<SchoolInfo>();
		schoolInfos1.add(schoolInfo3);
		schoolInfos1.add(schoolInfo4);
		
		Person person2 = new Person();
		person2.setName("李四");
		person2.setAge(24);
		person2.setSchoolInfo(schoolInfos1);
		person2.setUrl("http://pic17.nipic.com/20111018/8401083_100334400104_2.jpg");
		
		persons.add(person2);
		
		result.setPersonData(persons);
		
		//创建Gson
		Gson gson = new Gson();
		System.out.println(gson.toJson(result));
		
	}
}
