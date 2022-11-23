package hashcode_and_equals;

import java.util.Objects;

public class User {
    private String name;
    private String cpf;

    public String getName() {
        return name;
    }

    //Sobrescrevendo o equals para coleções que usam equals(). <- exemplo: ArrayList. Esta coleção valida diretamente pelo método equals().
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(cpf, user.cpf);
    }

    //Sobrescrevendo hash para coleções que usam hashCode(). <- exemplo: HashSet. Esta coleção valida diretamente pelo método hashCode().
    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public User(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    /*
     * Overriding the equals() method makes it compare the specified properties and not the hashcode anymore
     * */

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
