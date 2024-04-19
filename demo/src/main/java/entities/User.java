package entities;

import java.util.Objects;

public class User implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Long id;
    String nome;
    String password;
    String email;
    String telefone;
    
    @Override
	public int hashCode() {
		return Objects.hash(email, id, nome, password, telefone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Objects.equals(password, other.password) && Objects.equals(telefone, other.telefone);
	}
	public User() {
     
    }  
	public User(Long id, String nome, String email, String telefone, String password) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.password = password;
    }
	public String getpassword() {
        return password;
    }
    public void setpassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;

    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    } 
    public String getNome() { 
        return nome;
    } 
    public void setNome(String nome) { 
        this.nome = nome;
    } 
    public String getTelefone() { 
        return telefone;
    } 
    public void setTelefone(String telefone) { 
        this.telefone = telefone;
    }
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	} 

}

