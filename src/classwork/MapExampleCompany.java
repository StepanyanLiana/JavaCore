package classwork;

import java.util.*;

public class MapExampleCompany {
    public static void main(String[] args) {
        Map<Company, Integer> companyIntegerMap = new TreeMap<>(new Comparator<Company>() {
            @Override
            public int compare(Company company, Company t1) {
                return company.getName().compareTo(t1.getName());
            }
        });
        Person person = new Person("Liana", "Stepanyan");
        Person person2 = new Person("Liana", "Stepanyan");
        Company company = new Company("a001", "company1", person);
        Company company2 = new Company("a002", "company2", person2);
        company.getDirector().setName("Mane");
        companyIntegerMap.put(company, 20);
        companyIntegerMap.put(company2, 4);
        System.out.println(companyIntegerMap.get(company));
        Set<Company> companies = companyIntegerMap.keySet();
        System.out.println(companies);
        Collection<Integer> values = companyIntegerMap.values();
        System.out.println(values);
        Set<Map.Entry<Company, Integer>> entries = companyIntegerMap.entrySet();
        for (Map.Entry<Company, Integer> entry : entries) {
            System.out.println(entry.getKey().getName() + " -> " + entry.getValue());
        }
    }
}
