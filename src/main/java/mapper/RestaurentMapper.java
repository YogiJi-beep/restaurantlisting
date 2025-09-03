package mapper;

import com.codedecode.restaurentlisting.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.codedecode.restaurentlisting.dto.*;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface RestaurentMapper {

    RestaurentMapper INSTANCE = Mappers.getMapper(RestaurentMapper.class);

    Restaurant mapRestaurantDTOToRestaurant(RestaurentDTO restaurentDTO);
    RestaurentDTO mapRestaurentToRestaurentDTO(Restaurant restaurant);


}
