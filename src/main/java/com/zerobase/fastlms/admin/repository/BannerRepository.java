package com.zerobase.fastlms.admin.repository;

import com.zerobase.fastlms.admin.entity.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BannerRepository extends JpaRepository<Banner, Long> {
}
