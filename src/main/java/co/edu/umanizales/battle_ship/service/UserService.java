package co.edu.umanizales.battle_ship.service;

import co.edu.umanizales.battle_ship.model.TypeUser;
import co.edu.umanizales.battle_ship.model.User;
import co.edu.umanizales.battle_ship.model.UserDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private User administrator;
    private User player1;
    private User player2;

    public UserService() {
        administrator = new User("carloaiza@umanizales.edu.co",
                "123456",new TypeUser(1,"Administrador"));

    }

    public List<UserDTO> listUsers()
    {
        List<UserDTO> list= new ArrayList<>();
        list.add(administrator.userToDTO());
        if(player1!=null)
        {
            list.add(player1.userToDTO());
        }
        if(player2 != null)
        {
            list.add(player2.userToDTO());
        }
        return list;
    }

    public String createPlayer(User player, byte numPlayer)
    {
        if(numPlayer < 0 || numPlayer >2)
        {
            return "El número de jugador debe ser (1 o 2)";
        }

        if(numPlayer==1 && player1 !=null)
        {
            return "Ya se encuentra creado el jugador1";
        }
        if(numPlayer==2 && player2 !=null)
        {
            return "Ya se encuentra creado el jugador2";
        }
        if(numPlayer==1)
        {
            player1= player;
        }
        else
        {
            player2= player;
        }
        return "Se ha creado exitosamente el jugador";
    }
}