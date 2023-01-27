/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.0.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package iuresti.training.peopleandcars.controller;

import iuresti.training.peopleandcars.modelapi.Car;
import iuresti.training.peopleandcars.modelapi.People;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-27T16:20:47.279-06:00[America/Chicago]")
@Validated
public interface PeopleApi {

    /**
     * POST /people/{person_id}/car : Link car to a person
     * Link car to a person
     *
     * @param personId Person Id (required)
     * @param car Add car to a person (required)
     * @return Successfull operation (status code 200)
     *         or Person not found (status code 404)
     */
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/people/{person_id}/car",
        consumes = { "application/json", "application/xml" }
    )
    ResponseEntity<Void> addCar(
         @PathVariable("person_id") String personId,
         @Valid @RequestBody Car car
    );


    /**
     * POST /people : Add a new person
     * Create a person
     *
     * @param people Create a person (required)
     * @return Successfull operation (status code 201)
     *         or Unexpected errror (status code 500)
     */
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/people",
        produces = { "application/json", "application/xml" },
        consumes = { "application/json", "application/xml" }
    )
    ResponseEntity<People> createPerson(
         @Valid @RequestBody People people
    );


    /**
     * DELETE /people/{person_id} : Delete a person by Id
     * Delete a person by Id
     *
     * @param personId Person Id (required)
     * @return Successfull operation (status code 204)
     *         or Person not found (status code 404)
     */
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/people/{person_id}"
    )
    ResponseEntity<Void> deletePerson(
         @PathVariable("person_id") String personId
    );


    /**
     * GET /people : Get all people
     * Returns all people
     *
     * @return successful operation (status code 200)
     */
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/people",
        produces = { "application/json", "application/xml" }
    )
    ResponseEntity<List<People>> getAllPeople(
        
    );


    /**
     * GET /people/{person_id} : Find person by Id
     * Return a single person
     *
     * @param personId Person Id (required)
     * @return Successfull operation (status code 200)
     *         or Person not found (status code 404)
     */
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/people/{person_id}",
        produces = { "application/json", "application/xml" }
    )
    ResponseEntity<People> getPersonById(
         @PathVariable("person_id") String personId
    );


    /**
     * GET /people/{person_id}/car : Find all person&#39;s cars
     * Returns all cars beloging to a person
     *
     * @param personId Person Id (required)
     * @return Successfull operation (status code 200)
     *         or Person not found (status code 404)
     */
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/people/{person_id}/car",
        produces = { "application/json", "application/xml" }
    )
    ResponseEntity<List<Car>> getPersonCars(
         @PathVariable("person_id") String personId
    );


    /**
     * DELETE /people/{person_id}/car : Remove car from a person
     * Remove car to a person
     *
     * @param personId Person Id (required)
     * @param car Car to be removed (required)
     * @return Successfull operation (status code 204)
     *         or Person not found (status code 404)
     */
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/people/{person_id}/car",
        consumes = { "application/json", "application/xml" }
    )
    ResponseEntity<Void> removeCar(
         @PathVariable("person_id") String personId,
         @Valid @RequestBody Car car
    );


    /**
     * PUT /people/{person_id} : Update an existing person
     * Upate an existing person
     *
     * @param personId Person Id (required)
     * @param people Update a person (required)
     * @return Successfull operation (status code 200)
     *         or Person not found (status code 404)
     */
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/people/{person_id}",
        produces = { "application/json", "application/xml" },
        consumes = { "application/json", "application/xml" }
    )
    ResponseEntity<People> updatePerson(
         @PathVariable("person_id") String personId,
         @Valid @RequestBody People people
    );

}
