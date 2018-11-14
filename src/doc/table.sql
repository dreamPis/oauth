/*
 Navicat Premium Data Transfer

 Source Server         : pg9.6
 Source Server Type    : PostgreSQL
 Source Server Version : 90610
 Source Host           : localhost:5432
 Source Catalog        : ndt
 Source Schema         : boot

 Target Server Type    : PostgreSQL
 Target Server Version : 90610
 File Encoding         : 65001

 Date: 14/11/2018 21:03:48
*/


-- ----------------------------
-- Table structure for authority
-- ----------------------------
DROP TABLE IF EXISTS "ndt"."authority";
CREATE TABLE "ndt"."authority" (
  "id" varchar(32) COLLATE "pg_catalog"."default" NOT NULL,
  "name" varchar(50) COLLATE "pg_catalog"."default" NOT NULL,
  "createTime" timestamp(0) DEFAULT now(),
  "modifyTime" timestamp(0) DEFAULT now(),
  "description" varchar(255) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying
)
;
ALTER TABLE "ndt"."authority" OWNER TO "postgres";

-- ----------------------------
-- Table structure for clients
-- ----------------------------
DROP TABLE IF EXISTS "ndt"."clients";
CREATE TABLE "ndt"."clients" (
  "id" varchar(32) COLLATE "pg_catalog"."default" NOT NULL,
  "clientId" varchar(100) COLLATE "pg_catalog"."default" NOT NULL,
  "resourceIds" varchar(255) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "isSecretRequired" int2,
  "clientSecret" varchar(100) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "isScoped" int2,
  "scope" varchar(255) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "authorizedGrantTypes" varchar(255) COLLATE "pg_catalog"."default" NOT NULL,
  "registeredRedirectUri" varchar(255) COLLATE "pg_catalog"."default" NOT NULL,
  "authorities" varchar(255) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "isAutoApprove" int2,
  "accessTokenValiditySeconds" int4,
  "refreshTokenValiditySeconds" int4,
  "createTime" timestamp(0) DEFAULT now(),
  "modifyTime" timestamp(0) DEFAULT now()
)
;
ALTER TABLE "ndt"."clients" OWNER TO "postgres";

-- ----------------------------
-- Table structure for menus
-- ----------------------------
DROP TABLE IF EXISTS "ndt"."menus";
CREATE TABLE "ndt"."menus" (
  "id" varchar(32) COLLATE "pg_catalog"."default" NOT NULL,
  "text" varchar(50) COLLATE "pg_catalog"."default" NOT NULL,
  "icon" varchar(100) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "parentId" varchar(32) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "sort" int4,
  "link" varchar(255) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "group" int2,
  "createTime" timestamp(0) DEFAULT now(),
  "modifyTime" timestamp(0) DEFAULT now(),
  "description" varchar(255) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying
)
;
ALTER TABLE "ndt"."menus" OWNER TO "postgres";

-- ----------------------------
-- Table structure for menus_authority
-- ----------------------------
DROP TABLE IF EXISTS "ndt"."menus_authority";
CREATE TABLE "ndt"."menus_authority" (
  "id" varchar(32) COLLATE "pg_catalog"."default" NOT NULL,
  "menuId" varchar(32) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "authorityId" varchar(32) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying
)
;
ALTER TABLE "ndt"."menus_authority" OWNER TO "postgres";

-- ----------------------------
-- Table structure for resources
-- ----------------------------
DROP TABLE IF EXISTS "ndt"."resources";
CREATE TABLE "ndt"."resources" (
  "id" varchar(32) COLLATE "pg_catalog"."default" NOT NULL,
  "name" varchar(100) COLLATE "pg_catalog"."default" NOT NULL,
  "url" varchar(255) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "method" varchar(30) COLLATE "pg_catalog"."default" NOT NULL,
  "createTime" timestamp(0) DEFAULT now(),
  "modifyTime" timestamp(0) DEFAULT now(),
  "description" varchar(255) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying
)
;
ALTER TABLE "ndt"."resources" OWNER TO "postgres";

-- ----------------------------
-- Table structure for resources_authority
-- ----------------------------
DROP TABLE IF EXISTS "ndt"."resources_authority";
CREATE TABLE "ndt"."resources_authority" (
  "id" varchar(32) COLLATE "pg_catalog"."default" NOT NULL,
  "resourceId" varchar(32) COLLATE "pg_catalog"."default" NOT NULL,
  "authorityId" varchar(32) COLLATE "pg_catalog"."default" NOT NULL
)
;
ALTER TABLE "ndt"."resources_authority" OWNER TO "postgres";

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS "ndt"."role";
CREATE TABLE "ndt"."role" (
  "id" varchar(32) COLLATE "pg_catalog"."default" NOT NULL,
  "name" varchar(50) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "createTime" timestamp(0) DEFAULT now(),
  "modifyTime" timestamp(0) DEFAULT now(),
  "description" varchar(255) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying
)
;
ALTER TABLE "ndt"."role" OWNER TO "postgres";

-- ----------------------------
-- Table structure for role_authority
-- ----------------------------
DROP TABLE IF EXISTS "ndt"."role_authority";
CREATE TABLE "ndt"."role_authority" (
  "id" varchar(32) COLLATE "pg_catalog"."default" NOT NULL,
  "roleId" varchar(32) COLLATE "pg_catalog"."default" NOT NULL,
  "authorityId" varchar(32) COLLATE "pg_catalog"."default" NOT NULL
)
;
ALTER TABLE "ndt"."role_authority" OWNER TO "postgres";

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS "ndt"."user";
CREATE TABLE "ndt"."user" (
  "id" varchar(32) COLLATE "pg_catalog"."default" NOT NULL,
  "fullName" varchar(80) COLLATE "pg_catalog"."default" NOT NULL,
  "username" varchar(50) COLLATE "pg_catalog"."default" NOT NULL,
  "password" varchar(100) COLLATE "pg_catalog"."default" NOT NULL,
  "email" varchar(50) COLLATE "pg_catalog"."default" NOT NULL,
  "gender" int2 NOT NULL,
  "age" int2 NOT NULL,
  "isEnable" int2 NOT NULL,
  "createTime" timestamp(0) DEFAULT now(),
  "modifyTime" timestamp(0) DEFAULT now(),
  "description" varchar(255) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying
)
;
ALTER TABLE "ndt"."user" OWNER TO "postgres";

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS "ndt"."user_role";
CREATE TABLE "ndt"."user_role" (
  "id" varchar(32) COLLATE "pg_catalog"."default" NOT NULL,
  "userId" varchar(32) COLLATE "pg_catalog"."default" NOT NULL,
  "roleId" varchar(32) COLLATE "pg_catalog"."default" NOT NULL
)
;
ALTER TABLE "ndt"."user_role" OWNER TO "postgres";

-- ----------------------------
-- Primary Key structure for table authority
-- ----------------------------
ALTER TABLE "ndt"."authority" ADD CONSTRAINT "authority_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table clients
-- ----------------------------
ALTER TABLE "ndt"."clients" ADD CONSTRAINT "clients_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table menus
-- ----------------------------
ALTER TABLE "ndt"."menus" ADD CONSTRAINT "menus_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Indexes structure for table menus_authority
-- ----------------------------
CREATE INDEX "authorityId_copy_1" ON "ndt"."menus_authority" USING btree (
  "authorityId" COLLATE "pg_catalog"."default" "pg_catalog"."text_ops" ASC NULLS LAST
);
CREATE INDEX "menuId" ON "ndt"."menus_authority" USING btree (
  "menuId" COLLATE "pg_catalog"."default" "pg_catalog"."text_ops" ASC NULLS LAST
);

-- ----------------------------
-- Primary Key structure for table menus_authority
-- ----------------------------
ALTER TABLE "ndt"."menus_authority" ADD CONSTRAINT "menus_authority_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table resources
-- ----------------------------
ALTER TABLE "ndt"."resources" ADD CONSTRAINT "resources_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Indexes structure for table resources_authority
-- ----------------------------
CREATE INDEX "authorityId_copy_2" ON "ndt"."resources_authority" USING btree (
  "authorityId" COLLATE "pg_catalog"."default" "pg_catalog"."text_ops" ASC NULLS LAST
);
CREATE INDEX "resourceId" ON "ndt"."resources_authority" USING btree (
  "resourceId" COLLATE "pg_catalog"."default" "pg_catalog"."text_ops" ASC NULLS LAST
);

-- ----------------------------
-- Primary Key structure for table resources_authority
-- ----------------------------
ALTER TABLE "ndt"."resources_authority" ADD CONSTRAINT "resources_authority_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table role
-- ----------------------------
ALTER TABLE "ndt"."role" ADD CONSTRAINT "role_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Indexes structure for table role_authority
-- ----------------------------
CREATE INDEX "authorityId" ON "ndt"."role_authority" USING btree (
  "authorityId" COLLATE "pg_catalog"."default" "pg_catalog"."text_ops" ASC NULLS LAST
);
CREATE INDEX "roleId_copy_1" ON "ndt"."role_authority" USING btree (
  "roleId" COLLATE "pg_catalog"."default" "pg_catalog"."text_ops" ASC NULLS LAST
);

-- ----------------------------
-- Primary Key structure for table role_authority
-- ----------------------------
ALTER TABLE "ndt"."role_authority" ADD CONSTRAINT "role_authority_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Indexes structure for table user
-- ----------------------------
CREATE INDEX "username" ON "ndt"."user" USING btree (
  "username" COLLATE "pg_catalog"."default" "pg_catalog"."text_ops" ASC NULLS LAST
);

-- ----------------------------
-- Primary Key structure for table user
-- ----------------------------
ALTER TABLE "ndt"."user" ADD CONSTRAINT "user_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Indexes structure for table user_role
-- ----------------------------
CREATE INDEX "roleId" ON "ndt"."user_role" USING btree (
  "roleId" COLLATE "pg_catalog"."default" "pg_catalog"."text_ops" ASC NULLS LAST
);
CREATE INDEX "userId" ON "ndt"."user_role" USING btree (
  "userId" COLLATE "pg_catalog"."default" "pg_catalog"."text_ops" ASC NULLS LAST
);

-- ----------------------------
-- Primary Key structure for table user_role
-- ----------------------------
ALTER TABLE "ndt"."user_role" ADD CONSTRAINT "user_role_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Foreign Keys structure for table menus_authority
-- ----------------------------
ALTER TABLE "ndt"."menus_authority" ADD CONSTRAINT "menus_authority_ibfk_1" FOREIGN KEY ("menuId") REFERENCES "ndt"."menus" ("id") ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE "ndt"."menus_authority" ADD CONSTRAINT "menus_authority_ibfk_2" FOREIGN KEY ("authorityId") REFERENCES "ndt"."authority" ("id") ON DELETE RESTRICT ON UPDATE RESTRICT;

-- ----------------------------
-- Foreign Keys structure for table resources_authority
-- ----------------------------
ALTER TABLE "ndt"."resources_authority" ADD CONSTRAINT "resources_authority_ibfk_1" FOREIGN KEY ("resourceId") REFERENCES "ndt"."resources" ("id") ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE "ndt"."resources_authority" ADD CONSTRAINT "resources_authority_ibfk_2" FOREIGN KEY ("authorityId") REFERENCES "ndt"."authority" ("id") ON DELETE RESTRICT ON UPDATE RESTRICT;

-- ----------------------------
-- Foreign Keys structure for table role_authority
-- ----------------------------
ALTER TABLE "ndt"."role_authority" ADD CONSTRAINT "role_authority_ibfk_1" FOREIGN KEY ("roleId") REFERENCES "ndt"."role" ("id") ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE "ndt"."role_authority" ADD CONSTRAINT "role_authority_ibfk_2" FOREIGN KEY ("authorityId") REFERENCES "ndt"."authority" ("id") ON DELETE RESTRICT ON UPDATE RESTRICT;

-- ----------------------------
-- Foreign Keys structure for table user_role
-- ----------------------------
ALTER TABLE "ndt"."user_role" ADD CONSTRAINT "user_role_ibfk_1" FOREIGN KEY ("userId") REFERENCES "ndt"."user" ("id") ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE "ndt"."user_role" ADD CONSTRAINT "user_role_ibfk_2" FOREIGN KEY ("roleId") REFERENCES "ndt"."role" ("id") ON DELETE RESTRICT ON UPDATE RESTRICT;
