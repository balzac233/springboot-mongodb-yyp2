//package com.nelioalves.workshopmongo.services;
//
//import java.util.List;
//
//import com.nelioalves.workshopmongo.dao.UserDao;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.nelioalves.workshopmongo.domain.User;
//import com.nelioalves.workshopmongo.dto.UserDTO;
////import com.nelioalves.workshopmongo.repository.UserRepository;
//
//
//@Service
//public class UserService {
//
////	@Autowired
////	private UserRepository repo;
//
//    @Autowired
//    private UserDao userDao;
//
//    public List<User> findAll() {
//        return userDao.findAll();
//    }
//
////    public User findById(String id) {
////        Optional<User> obj = userDao.findByPage(id);
////        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
////    }
//
//    public void insert(User obj) {
//         userDao.insert(obj);
//    }
//
////    public void delete(String id) {
////        findById(id);
////        userDao.remove(id);
////    }
//
//    public void update(User obj) {
//        User newObj = findById(obj.getId());
//        updateData(newObj, obj);
//        userDao.insert(newObj);
//    }
//
//    private void updateData(User newObj, User obj) {
//        newObj.setName(obj.getName());
//        newObj.setEmail(obj.getEmail());
//    }
//
//    public User fromDTO(UserDTO objDto) {
//        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
//    }
//}
