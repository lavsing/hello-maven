package maven.tutotial.mapstruct.mapper;

import maven.tutotial.mapstruct.domain.User;
import maven.tutotial.mapstruct.model.UserCommand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

  UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

  UserCommand userToUserCommand(User user);

  User userCommandToUser(UserCommand userCommand);
}
