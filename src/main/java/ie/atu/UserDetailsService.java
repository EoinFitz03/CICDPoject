package ie.atu;

import org.springframework.stereotype.Service;

@Service
public class UserDetailsService {

    private UserDetailsRepository userDetailsRepository;

    public UserDetailsService(UserDetailsRepository userDetailsRepository){ this.userDetailsRepository = userDetailsRepository;  }



    //post
    public void saveUserDetails(UserDetails userDetails) {
        userDetailsRepository.save(userDetails);
        System.out.println("User saved: " + userDetails);
    }


    //get
    public UserDetails getUserDetailsByDetailsId(String detailsId){
        return userDetailsRepository.findByDetailsId(detailsId);
    }

}