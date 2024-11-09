package academy.devdojo.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio.*;
import academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio.*;


public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        AirCraft airCraft = new AirCraft("777");
        Country country = Country.BRAZIL;
        Currency currency = CurrecnyFactory.newCurrency(country);
        Person person = new Person.PersonBuilder()
                .firsname("Willian")
                .lastname("Rd")
                .email("Willian")
                .username("AAAA")
                .build();
        ReportDto reportDto = ReportDto.ReportDtoBuilder.builder()
                .aircraftName(airCraft.getName())
                .country(country)
                .currency(currency)
                .personName(person.getFirsname())
                .build();
        System.out.println(reportDto);
    }
}
