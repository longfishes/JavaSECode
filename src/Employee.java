//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
import java.io.Serializable;
import java.time.LocalDateTime;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String username;
    private String name;
    private String password;
    private String phone;
    private String sex;
    private String idNumber;
    private Integer status;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private Long createUser;
    private Long updateUser;

    public static Employee.EmployeeBuilder builder() {
        return new Employee.EmployeeBuilder();
    }

    public Long getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getSex() {
        return this.sex;
    }

    public String getIdNumber() {
        return this.idNumber;
    }

    public Integer getStatus() {
        return this.status;
    }

    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    public LocalDateTime getUpdateTime() {
        return this.updateTime;
    }

    public Long getCreateUser() {
        return this.createUser;
    }

    public Long getUpdateUser() {
        return this.updateUser;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public void setPhone(final String phone) {
        this.phone = phone;
    }

    public void setSex(final String sex) {
        this.sex = sex;
    }

    public void setIdNumber(final String idNumber) {
        this.idNumber = idNumber;
    }

    public void setStatus(final Integer status) {
        this.status = status;
    }

    public void setCreateTime(final LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(final LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public void setCreateUser(final Long createUser) {
        this.createUser = createUser;
    }

    public void setUpdateUser(final Long updateUser) {
        this.updateUser = updateUser;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Employee)) {
            return false;
        } else {
            Employee other = (Employee)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label155: {
                    Object this$id = this.getId();
                    Object other$id = other.getId();
                    if (this$id == null) {
                        if (other$id == null) {
                            break label155;
                        }
                    } else if (this$id.equals(other$id)) {
                        break label155;
                    }

                    return false;
                }

                Object this$status = this.getStatus();
                Object other$status = other.getStatus();
                if (this$status == null) {
                    if (other$status != null) {
                        return false;
                    }
                } else if (!this$status.equals(other$status)) {
                    return false;
                }

                Object this$createUser = this.getCreateUser();
                Object other$createUser = other.getCreateUser();
                if (this$createUser == null) {
                    if (other$createUser != null) {
                        return false;
                    }
                } else if (!this$createUser.equals(other$createUser)) {
                    return false;
                }

                label134: {
                    Object this$updateUser = this.getUpdateUser();
                    Object other$updateUser = other.getUpdateUser();
                    if (this$updateUser == null) {
                        if (other$updateUser == null) {
                            break label134;
                        }
                    } else if (this$updateUser.equals(other$updateUser)) {
                        break label134;
                    }

                    return false;
                }

                label127: {
                    Object this$username = this.getUsername();
                    Object other$username = other.getUsername();
                    if (this$username == null) {
                        if (other$username == null) {
                            break label127;
                        }
                    } else if (this$username.equals(other$username)) {
                        break label127;
                    }

                    return false;
                }

                label120: {
                    Object this$name = this.getName();
                    Object other$name = other.getName();
                    if (this$name == null) {
                        if (other$name == null) {
                            break label120;
                        }
                    } else if (this$name.equals(other$name)) {
                        break label120;
                    }

                    return false;
                }

                Object this$password = this.getPassword();
                Object other$password = other.getPassword();
                if (this$password == null) {
                    if (other$password != null) {
                        return false;
                    }
                } else if (!this$password.equals(other$password)) {
                    return false;
                }

                label106: {
                    Object this$phone = this.getPhone();
                    Object other$phone = other.getPhone();
                    if (this$phone == null) {
                        if (other$phone == null) {
                            break label106;
                        }
                    } else if (this$phone.equals(other$phone)) {
                        break label106;
                    }

                    return false;
                }

                Object this$sex = this.getSex();
                Object other$sex = other.getSex();
                if (this$sex == null) {
                    if (other$sex != null) {
                        return false;
                    }
                } else if (!this$sex.equals(other$sex)) {
                    return false;
                }

                label92: {
                    Object this$idNumber = this.getIdNumber();
                    Object other$idNumber = other.getIdNumber();
                    if (this$idNumber == null) {
                        if (other$idNumber == null) {
                            break label92;
                        }
                    } else if (this$idNumber.equals(other$idNumber)) {
                        break label92;
                    }

                    return false;
                }

                Object this$createTime = this.getCreateTime();
                Object other$createTime = other.getCreateTime();
                if (this$createTime == null) {
                    if (other$createTime != null) {
                        return false;
                    }
                } else if (!this$createTime.equals(other$createTime)) {
                    return false;
                }

                Object this$updateTime = this.getUpdateTime();
                Object other$updateTime = other.getUpdateTime();
                if (this$updateTime == null) {
                    if (other$updateTime != null) {
                        return false;
                    }
                } else if (!this$updateTime.equals(other$updateTime)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Employee;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : $status.hashCode());
        Object $createUser = this.getCreateUser();
        result = result * 59 + ($createUser == null ? 43 : $createUser.hashCode());
        Object $updateUser = this.getUpdateUser();
        result = result * 59 + ($updateUser == null ? 43 : $updateUser.hashCode());
        Object $username = this.getUsername();
        result = result * 59 + ($username == null ? 43 : $username.hashCode());
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        Object $password = this.getPassword();
        result = result * 59 + ($password == null ? 43 : $password.hashCode());
        Object $phone = this.getPhone();
        result = result * 59 + ($phone == null ? 43 : $phone.hashCode());
        Object $sex = this.getSex();
        result = result * 59 + ($sex == null ? 43 : $sex.hashCode());
        Object $idNumber = this.getIdNumber();
        result = result * 59 + ($idNumber == null ? 43 : $idNumber.hashCode());
        Object $createTime = this.getCreateTime();
        result = result * 59 + ($createTime == null ? 43 : $createTime.hashCode());
        Object $updateTime = this.getUpdateTime();
        result = result * 59 + ($updateTime == null ? 43 : $updateTime.hashCode());
        return result;
    }

    public String toString() {
        return "Employee(id=" + this.getId() + ", username=" + this.getUsername() + ", name=" + this.getName() + ", password=" + this.getPassword() + ", phone=" + this.getPhone() + ", sex=" + this.getSex() + ", idNumber=" + this.getIdNumber() + ", status=" + this.getStatus() + ", createTime=" + this.getCreateTime() + ", updateTime=" + this.getUpdateTime() + ", createUser=" + this.getCreateUser() + ", updateUser=" + this.getUpdateUser() + ")";
    }

    public Employee() {
    }

    public Employee(final Long id, final String username, final String name, final String password, final String phone, final String sex, final String idNumber, final Integer status, final LocalDateTime createTime, final LocalDateTime updateTime, final Long createUser, final Long updateUser) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.sex = sex;
        this.idNumber = idNumber;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.createUser = createUser;
        this.updateUser = updateUser;
    }

    public static class EmployeeBuilder {
        private Long id;
        private String username;
        private String name;
        private String password;
        private String phone;
        private String sex;
        private String idNumber;
        private Integer status;
        private LocalDateTime createTime;
        private LocalDateTime updateTime;
        private Long createUser;
        private Long updateUser;

        EmployeeBuilder() {
        }

        public Employee.EmployeeBuilder id(final Long id) {
            this.id = id;
            return this;
        }

        public Employee.EmployeeBuilder username(final String username) {
            this.username = username;
            return this;
        }

        public Employee.EmployeeBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public Employee.EmployeeBuilder password(final String password) {
            this.password = password;
            return this;
        }

        public Employee.EmployeeBuilder phone(final String phone) {
            this.phone = phone;
            return this;
        }

        public Employee.EmployeeBuilder sex(final String sex) {
            this.sex = sex;
            return this;
        }

        public Employee.EmployeeBuilder idNumber(final String idNumber) {
            this.idNumber = idNumber;
            return this;
        }

        public Employee.EmployeeBuilder status(final Integer status) {
            this.status = status;
            return this;
        }

        public Employee.EmployeeBuilder createTime(final LocalDateTime createTime) {
            this.createTime = createTime;
            return this;
        }

        public Employee.EmployeeBuilder updateTime(final LocalDateTime updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Employee.EmployeeBuilder createUser(final Long createUser) {
            this.createUser = createUser;
            return this;
        }

        public Employee.EmployeeBuilder updateUser(final Long updateUser) {
            this.updateUser = updateUser;
            return this;
        }

        public Employee build() {
            return new Employee(this.id, this.username, this.name, this.password, this.phone, this.sex, this.idNumber, this.status, this.createTime, this.updateTime, this.createUser, this.updateUser);
        }

        public String toString() {
            return "Employee.EmployeeBuilder(id=" + this.id + ", username=" + this.username + ", name=" + this.name + ", password=" + this.password + ", phone=" + this.phone + ", sex=" + this.sex + ", idNumber=" + this.idNumber + ", status=" + this.status + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", createUser=" + this.createUser + ", updateUser=" + this.updateUser + ")";
        }
    }
}
