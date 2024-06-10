package org.example.airline_reservation.Repository;

import org.example.airline_reservation.Models.ForgotPasswordDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForgotPasswordRepository extends JpaRepository<ForgotPasswordDetails, Integer> {

    ForgotPasswordDetails save(ForgotPasswordDetails forgotPasswordDetails);
    
    ForgotPasswordDetails findByToken(String token);
}
