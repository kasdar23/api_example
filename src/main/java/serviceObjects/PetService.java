package serviceObjects;

import com.fasterxml.jackson.core.JsonProcessingException;
import dtoObjects.Pet;

import static base.CommonConstants.PET_END_POINT;
import static io.restassured.RestAssured.*;

public class PetService extends CommonService {

    public Pet addNewPet(Pet pet) {

        return given()
                .spec(request)
                .basePath(PET_END_POINT)
                .body(pet)
                .post()
                .then()
                .log().all()
                .spec(responseSuccess)
                .extract()
                .body().as(Pet.class);

    }

    public void uploadImage() {
    }

    public void updateExistingPet() {
    }

    public void findPetsByStatus() {
    }

    public void findPetById() {
    }

    public void updateExistingPetById() {
    }

    public void deletePet() {
    }


}
