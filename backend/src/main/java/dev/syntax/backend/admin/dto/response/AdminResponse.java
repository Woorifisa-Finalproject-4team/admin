package dev.syntax.backend.admin.dto.response;

import dev.syntax.backend.profile.model.ServicePurpose;
import dev.syntax.backend.profile.model.User;
import dev.syntax.backend.profile.model.UserAgeGroup;
import lombok.Builder;
import lombok.Getter;

@Getter
public class AdminResponse {

    private String name;
    private String userId;
    private ServicePurpose servicePurpose;
    private UserAgeGroup userAgeGroup;
    private int asset;

    @Builder
    public AdminResponse(String name, String userId, ServicePurpose servicePurpose, UserAgeGroup userAgeGroup, int asset) {
        this.name = name;
        this.userId = userId;
        this.servicePurpose = servicePurpose;
        this.userAgeGroup = userAgeGroup;
        this.asset = asset;
    }

    public static AdminResponse profileInfoFrom(AdminResponse user) {
        return new AdminResponse(user.getName(),user.getUserId(),user.getServicePurpose(),user.getUserAgeGroup(),user.getAsset());
    }

    public AdminResponse from(User user) {

    }
//    public static OwnerResponse from(Owner owner) {
//        final Long id = owner.getId();
//        final String firstName = owner.getFirstName();
//        final String lastName = owner.getLastName();
//        final String address = owner.getAddress();
//        final String city = owner.getCity();
//        final String telephone = owner.getTelephone();
//        final List<PetResponse> pets = owner.getPets().stream()
//                .map(PetResponse::from)
//                .collect(Collectors.toList());
//        return new OwnerResponse(id, firstName, lastName, address, city, telephone, pets);
//    }
}
