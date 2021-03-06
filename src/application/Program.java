package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== Teste 1: Seller findbyid ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("");
        System.out.println("=== Teste 2: Seller findbyidDepartment ===");
        Department department = new Department(2,null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for (Seller obj : list){
            System.out.println(obj);
        }
        System.out.println("");
        System.out.println("=== Teste 3: Seller findall ===");

       list = sellerDao.findAll();

        for (Seller obj : list){
            System.out.println(obj);
        }
        System.out.println("");
        System.out.println("=== Teste 4: Seller insertr ===");

        Seller newSeller = new Seller(null,"greg", "greg@email.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserido!: = " + newSeller.getId());

        System.out.println("");
        System.out.println("=== Teste 5: Seller update ===");

        seller = sellerDao.findById(1);
        seller.setName("Marta Waine");
        sellerDao.update(seller);
        System.out.println("updated!");


    }
}
