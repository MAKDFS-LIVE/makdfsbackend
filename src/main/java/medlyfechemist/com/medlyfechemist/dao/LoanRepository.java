package medlyfechemist.com.medlyfechemist.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import medlyfechemist.com.medlyfechemist.entites.Loan;

public interface LoanRepository extends CrudRepository<Loan, Long> {
    
    public List<Loan> findAllByUserid(String useridString);
    
}
