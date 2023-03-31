package javaapplication1;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class javaapplication1 {
  
    /**
     *
     * @param request
     * @return
     */
    @PostMapping("/user-data")
  public ResponseEntity<UserDataResponse> getUserData(@RequestBody UserDataRequest request) {
    // extract the data from the request array and prepare the response
    int userId = 123;
    String emailId = "user@example.com";
    String collegeRollNumber = "XYZ123";
    List<Integer> evenNumbers = new ArrayList<>();
    List<Integer> oddNumbers = new ArrayList<>();
    List<String> upperCaseLetters = new ArrayList<>();
    for (Object item : request.getData()) {
      if (item instanceof Integer) {
        int number = (int) item;
        if (number % 2 == 0) {
          evenNumbers.add(number);
          } else {
          oddNumbers.add(number);
        }
      } else if (item instanceof String) {
        String letter = (String) item;
        if (letter.matches("[a-zA-Z]")) {
          upperCaseLetters.add(letter.toUpperCase());
        }
      }
    }
    // construct the response object
    UserDataResponse response = new UserDataResponse();
    response.setStatus("success");
    response.setUserId(userId);
    response.setEmailId(emailId);
    response.setCollegeRollNumber(collegeRollNumber);
    response.setEvenNumbers(evenNumbers);
    response.setOddNumbers(oddNumbers);
    response.setUpperCaseLetters(upperCaseLetters);
    return ResponseEntity.ok(response);
  }

    private static class UserDataRequest {

        public UserDataRequest() {
        }

        private Iterable<Object> getData() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
