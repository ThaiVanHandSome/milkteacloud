package hcmute.model;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class BranchModel{
	private Integer idBranch;
	private String name;
	private String addressDetail;
	private String opentime;
	private String image;
	private MultipartFile imageFile;
	private String description;
	private String idCity;
	private Boolean isEdit = false;

    public Integer getIdBranch() {
		return idBranch;
	}
	public void setIdBranch(Integer idBranch) {
		this.idBranch = idBranch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddressDetail() {
		return addressDetail;
	}
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}
	public String getOpentime() {
		return opentime;
	}
	public void setOpentime(String opentime) {
		this.opentime = opentime;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public MultipartFile getImageFile() {
		return imageFile;
	}
	public void setImageFile(MultipartFile imageFile) {
		this.imageFile = imageFile;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIdCity() {
		return idCity;
	}
	public void setIdCity(String idCity) {
		this.idCity = idCity;
	}
	public Boolean getIsEdit() {
		return isEdit;
	}
	public void setIsEdit(Boolean isEdit) {
		this.isEdit = isEdit;
	}
	public BranchModel(Integer idBranch, String name, String addressDetail, String opentime, String image,
			MultipartFile imageFile, String description, String idCity, Boolean isEdit) {
		super();
		this.idBranch = idBranch;
		this.name = name;
		this.addressDetail = addressDetail;
		this.opentime = opentime;
		this.image = image;
		this.imageFile = imageFile;
		this.description = description;
		this.idCity = idCity;
		this.isEdit = isEdit;
	}
	public BranchModel() {
		super();
	}
}
