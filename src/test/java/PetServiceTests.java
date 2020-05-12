import dtoObjects.Pet;
import dtoObjects.inner.Category;
import dtoObjects.inner.Tags;
import org.testng.Assert;
import org.testng.annotations.Test;
import serviceObjects.PetService;

import java.util.ArrayList;
import java.util.List;

public class PetServiceTests {
    PetService petService = new PetService();

    @Test
    public void createPet() {
        //crete test data
        List<String> photoUrls = new ArrayList<>();
        photoUrls.add("string");
        List<Tags> tags= new ArrayList<>();
        tags.add(new Tags(0L,"string"));
        Pet requestPet = new Pet(0L,new Category(0L,"string"),"doggie", photoUrls,tags, "available");
        //send request
        Pet responsePet = petService.addNewPet(requestPet);
        //validation
        Assert.assertEquals(requestPet.getName(),responsePet.getName());
    }
}
