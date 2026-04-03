package SinhVien;

public class DuplicateStudentIdException extends Exception {
    private String duplicateId;

    public DuplicateStudentIdException(String message) {
        super(message);
    }

    public DuplicateStudentIdException(String message, String duplicateId) {
        super(message);
        this.duplicateId = duplicateId;
    }

    public String getDuplicateId() {
        return duplicateId;
    }
}
