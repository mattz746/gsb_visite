<?php

declare(strict_types=1);

namespace DoctrineMigrations;

use Doctrine\DBAL\Schema\Schema;
use Doctrine\Migrations\AbstractMigration;

/**
 * Auto-generated Migration: Please modify to your needs!
 */
final class Version20230313160141 extends AbstractMigration
{
    public function getDescription(): string
    {
        return '';
    }

    public function up(Schema $schema): void
    {
        // this up() migration is auto-generated, please modify it to your needs
        $this->addSql('ALTER TABLE visite ADD user_id INT DEFAULT NULL, ADD praticien_id INT DEFAULT NULL');
        $this->addSql('ALTER TABLE visite ADD CONSTRAINT FK_B09C8CBBA76ED395 FOREIGN KEY (user_id) REFERENCES `user` (id)');
        $this->addSql('ALTER TABLE visite ADD CONSTRAINT FK_B09C8CBB2391866B FOREIGN KEY (praticien_id) REFERENCES praticien (id)');
        $this->addSql('CREATE INDEX IDX_B09C8CBBA76ED395 ON visite (user_id)');
        $this->addSql('CREATE INDEX IDX_B09C8CBB2391866B ON visite (praticien_id)');
    }

    public function down(Schema $schema): void
    {
        // this down() migration is auto-generated, please modify it to your needs
        $this->addSql('ALTER TABLE visite DROP FOREIGN KEY FK_B09C8CBBA76ED395');
        $this->addSql('ALTER TABLE visite DROP FOREIGN KEY FK_B09C8CBB2391866B');
        $this->addSql('DROP INDEX IDX_B09C8CBBA76ED395 ON visite');
        $this->addSql('DROP INDEX IDX_B09C8CBB2391866B ON visite');
        $this->addSql('ALTER TABLE visite DROP user_id, DROP praticien_id');
    }
}
